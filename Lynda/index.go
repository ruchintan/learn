package main

import (
	"fmt"
	"html/template"
	"net/http"
)

type page struct {
	Name string
}

func main() {

	temp := template.Must(template.ParseFiles("index.html"))
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {

		p := page{Name: "ruchi"}
		if name := r.FormValue("name"); name != "" {
			p.Name = name
		}

		if err := temp.ExecuteTemplate(w, "index.html", p); err != nil {

			http.Error(w, err.Error(), http.StatusInternalServerError)
		}
		//fmt.Fprintf(w, "PART 1")
	})

	fmt.Println(http.ListenAndServe(":1111", nil))

}
