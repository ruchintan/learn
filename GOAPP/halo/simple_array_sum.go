package main

import "fmt"

func main() {

	var input,num int
	sum := 0
	fmt.Scanln(&input)

	for i:=0;i<input;i++{
		fmt.Scan(&num)
		sum = sum +num
	}
	fmt.Print(sum)

}
