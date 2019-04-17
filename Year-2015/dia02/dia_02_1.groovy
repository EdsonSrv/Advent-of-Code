def f = new File("input")
def total_paper = 0
def wrappingPaper(l, w, h){
	def sides = [w*h, l*h, l*w] 
	2 * sides.sum() + sides.min()
}
f.eachLine() {
	line ->
	def sides = line.split('x')
	total_paper += wrappingPaper(sides[0].toInteger(),sides[1].toInteger(),sides[2].toInteger())
}
println total_paper
