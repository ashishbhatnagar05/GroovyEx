package examples
import groovy.json.JsonSlurper

class ICNDBService{

	void getJokes() {
		String base='http://api.icndb.com/jokes/random?'
		def qs=[firstName:'ashish',lastName:'bhatnagar'].collect{ k,v -> "$k=$v" }.join('&')
		String result="$base$qs".toURL().text
		def json=new JsonSlurper().parseText(result)
		println json.value.joke
	}
}