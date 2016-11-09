package main

import "fmt"

func main() {

	var testcase,student,treshold,time int
	fmt.Scanln(&testcase)
	for i:=0;i<testcase;i++{
		attend:=0
		fmt.Scan(&student)
		fmt.Scanln(&treshold)
		for j:=0;j<student;j++{
			fmt.Scan(&time)
			if time<=0 && attend<treshold{
				attend++
			}
		}
		if attend < treshold{
			fmt.Println("YES")
		}else{
			fmt.Println("NO")
		}
	}

}
