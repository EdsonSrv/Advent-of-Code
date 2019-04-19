def f = new File("input")
def houses =[:]

def visitHouse(char c, int x,int y){
	def xi = x
	def yi = y
	def position
	if (c == '^'){ 
		y += 1 
		position = new Tuple2(x,y)
	}else if (c == 'v'){
		y -= 1
		position = new Tuple2(x,y)
	}else if (c == '<'){
		x -= 1
		position = new Tuple2(x,y)
	}else if (c == '>'){
		x += 1
		position = new Tuple2(x,y)
	}
	if (houses.containsKey(position)){
		def val = houses[position]
		houses[position] = val +1;
	}else houses[position] = 1
	position
}

//coordenadas de Santa (S) y el Robot (R)
def xS = 0, yS = 0, xR = 0, yR = 0
def positionSanta = new Tuple2(xS, yS)
def positionRobot = new Tuple2(xR, yR)
houses[new Tuple2(0,0)] = 2
def turnSanta = true
def turnRobot = false

f.eachLine() {
	line -> 
	for(char c: line){
		if (turnSanta)
			println "soy santa"
	}
}
total = 0
for (Tuple2 key: houses.keySet()){
	if (houses[key] >= 1)
	total += 1
}
println total