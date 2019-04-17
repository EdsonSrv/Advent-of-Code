def f = new File("input")
def wrappingPaper(l, w, h){
	side_one = w*h//l
	side_two = l*h//w
	side_three = l*w//h

	2*side_one+2*side_two+2*side_three
}

println wrappingPaper(2,3,4)

/*f.eachLine() {
	line -> 
	println "$line"
}*/
