package main

import "fmt"

func main() {

	var A [3] int
	var B [3] int
	alice := 0
	bob := 0
	for i:=0;i<3;i++{
		fmt.Scan(&A[i])
	}
	for i:=0;i<3;i++{
		fmt.Scan(&B[i])
	}
	for i:=0;i<3;i++{
		if A[i] < B[i] {
			bob++
		} else if A[i] > B[i]{
			alice++
		}
	}
	fmt.Print(alice, " ", bob)

}
