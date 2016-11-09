package main

import (
	"fmt"
	"math"
)

func main() {

	var input int
	fmt.Scanln(&input)
	matrix := make([][]int, input)
	for i := 0; i < input; i++ {
		matrix[i] = make([]int, 0, input)
		vector := make([]int, input)
		for j := 0; j < input; j++ {
			fmt.Scan(&vector[j])
			matrix[i] = append(matrix[i], vector[j])
		}
	}
	//fmt.Println(matrix[0][input-1])
	left:=0
	right:=0
	l:=input-1
	for k:=0;k<input;k++{
		left = left + matrix[k][k]
		right = right + matrix[k][l]
		l--
	}
	fmt.Println(math.Abs(float64(left-right)))
	/*if (left-right) < 0{
		fmt.Print(0-(left-right))
	}else{
		fmt.Print(left-right)
	}*/

}
