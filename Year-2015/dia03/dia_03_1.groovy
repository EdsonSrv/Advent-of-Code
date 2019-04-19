def f = new File("input")
def houses =[:]
def x = 0
def y = 0
def position = new Tuple2(x,y)
houses[position] = 1
f.eachLine() {
	line -> 
	for(char c: line){
		def xi = x
		def yi = y
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
	}
}
total = 0
for (Tuple2 key: houses.keySet()){
	if (houses[key] >= 1)
	total += 1
}
println total
