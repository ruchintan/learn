package main

import "fmt"

func main() {
	var age, name = 10.2, "ruchi"
	y:= "yusuf kebo"
	if age == 10.3 {
	fmt.Printf("hello, world %f %f %T\n", age, age+10, age)
	}
	for i:=0; i<4; i++{
	fmt.Printf("hello, %T %s\n", name, name) }
	fmt.Print("bos IBM : " ,y)
}
