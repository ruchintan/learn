package main

import "fmt"

func main() {

	var n,num int
	zero:=0
	positive:=0
	negative:=0
	fmt.Scanln(&n)
	for i:=0;i<n;i++{
		fmt.Scan(&num)
		if num == 0{
			zero++
		}else if num < 0{
			negative++
		}else if num>0{
			positive++
		}
	}
	fmt.Println(float32(positive)/float32(n))
	fmt.Println(float32(negative)/float32(n))
	fmt.Println(float32(zero) / float32(n))


}
