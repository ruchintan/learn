package main

import "fmt"

func main() {
	var input int
	var num,sum int64
	sum = 0
	fmt.Scanln(&input)
	for i:=0;i<input;i++{
		fmt.Scan(&num)
		sum = sum +num
	}
	fmt.Print(sum)
}
