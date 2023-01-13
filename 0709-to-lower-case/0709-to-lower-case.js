/**
 * @param {string} s
 * @return {string}
 */
var toLowerCase = function(s) {
let res = '';
    
for(let i = 0; i < s.length; i++){
  if(s[i].charCodeAt() >= 65 && s[i].charCodeAt() <= 90){
	res += String.fromCharCode(s[i].charCodeAt() + 32);    
  } else {
	res += s[i];
  }
}

return res;};