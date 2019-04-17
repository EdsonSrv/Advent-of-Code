def f = new File("input")
def total_ribbon = 0

def ribbon(l, w, h){
	def bow = l*w*h
	def sides = [l, w, h]
	sides.sort()
	2*sides[0]+2*sides[1]+bow
}
f.eachLine() {
	line ->
	def sides = line.split('x')
	total_ribbon += ribbon(sides[0].toInteger(),sides[1].toInteger(),sides[2].toInteger())
}
println total_ribbon
