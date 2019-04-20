import java.security.MessageDigest

def md5Hash(String input){
	def md = MessageDigest.getInstance("MD5")
	md.update(input.getBytes())
	byte[] digest = md.digest()
	def sb = new StringBuffer()
	for (byte b : digest) {
		sb.append(String.format("%02x", b & 0xff))
	}
	sb.toString()
}

def anwer(String secretKey) {
	def i = 0
	while (true) {
		def input = secretKey + i
		if (md5Hash(input)
					.substring(0, 5)
					.equals("00000")){
			break
		}
		i++
	}
	i - 1
}

println anwer("iwrupvqb")