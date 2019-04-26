import java.security.MessageDigest

def md5Hash(String input){
	def md = MessageDigest.getInstance("MD5")
	md.update(input.bytes)
	byte[] digest = md.digest()
	def sb = new StringBuffer()
	for (b in digest) {
		sb.append(String.format("%02x", b & 0xff))
	}
	sb.toString()
}

def anwer(String secretKey) {
	def i = 0
	while (true) {
		def input = secretKey + i
		if (md5Hash(input)
					.substring(0, 6)
					.equals("000000")){
			break
		}
		i++
	}
	i 
}

println anwer("iwrupvqb")