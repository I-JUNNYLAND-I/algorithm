/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let obj={}
    let res=[]
    let newStrs=strs.map((v)=>v.split("").sort().join(""))
    for(i=0;i<newStrs.length;i++){
        if(obj[newStrs[i]]){
            obj[newStrs[i]].push(strs[i])
        }
        else{
            obj[newStrs[i]]=[strs[i]]
        }
    }
    for(words of Object.values(obj)){
        res.push(words)
    }
    return res
};