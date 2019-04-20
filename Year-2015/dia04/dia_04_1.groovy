import java.security.MessageDigest

def digest = MessageDigest.getInstance("MD5")
 
//Quick MD5 of text
def secretKey = 'iwrupvqb'
def i = 0

while (true){
	def temporal = secretKey + i
	println "temporal: $temporal"
	def answre = new BigInteger(1,digest.digest(temporal.getBytes())).toString(16)//.padLeft(32,"0")
	println "answre: $answre"
	answre = "00000"+answre
	if(answre.startsWith("00000")){
		println i+answre
		break
	}
	i += 1
}

//println md5hash1
