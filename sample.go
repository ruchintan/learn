package main

import (
	"fmt"
	"log"
	"net/http"

	"github.com/garyburd/redigo/redis"
)

func main() {
	pool := &redis.Pool{
		Dial: func() (redis.Conn, error) {
			return redis.Dial("tcp", "localhost:6379")
		},
	}
	http.HandleFunc("/foo/set", func(w http.ResponseWriter, r *http.Request) {
		k := r.FormValue("key")
		v := r.FormValue("value")

		conn := pool.Get()
		defer conn.Close()

		_, err := conn.Do("SET", k, append_a(v), "EX", 10)
		if err != nil {
			fmt.Println(err)
		}
		fmt.Fprintln(w, "success set")
		return
	})

	log.Println("listening...")
	log.Fatal(http.ListenAndServe(":1111", nil))
	return
}

func append_a(s string) string {
	return fmt.Sprintf("%sa", s)
}
