def f = new File("input")
def houses =[:]

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
		if (turnSanta){
			//Estracto de código
			if (c == '^'){ 
				yS += 1 
				positionSanta = new Tuple2(xS,yS)
			}else if (c == 'v'){
				yS -= 1
				positionSanta = new Tuple2(xS,yS)
			}else if (c == '<'){
				xS -= 1
				positionSanta = new Tuple2(xS,yS)
			}else if (c == '>'){
				xS += 1
				positionSanta = new Tuple2(xS,yS)
			}
			if (houses.containsKey(positionSanta)){
				def val = houses[positionSanta]
				houses[positionSanta] = val +1;
			}else houses[positionSanta] = 1
			//
			turnSanta = false
			turnRobot = true
		}else{
			//Estracto de código
			if (c == '^'){ 
				yR += 1 
				positionRobot = new Tuple2(xR,yR)
			}else if (c == 'v'){
				yR -= 1
				positionRobot = new Tuple2(xR,yR)
			}else if (c == '<'){
				xR -= 1
				positionRobot = new Tuple2(xR,yR)
			}else if (c == '>'){
				xR += 1
				positionRobot = new Tuple2(xR,yR)
			}
			if (houses.containsKey(positionRobot)){
				def val = houses[positionRobot]
				houses[positionRobot] = val +1;
			}else houses[positionRobot] = 1
			//
			turnRobot = false
			turnSanta = true
		}
	}
}
total = 0
for (Tuple2 key: houses.keySet()){
	if (houses[key] >= 1)
	total += 1
}
println total

/*
def visitHouse(char c, int x,int y){
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
*/