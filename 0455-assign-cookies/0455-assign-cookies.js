/**
 * @param {number[]} g
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    console.log(g,s)

    g.sort((a,b)=>a-b)
    s.sort((a,b)=>a-b)
    let i=0
    let j=0
    let count=0
    let iEnd=g.length;
    let jEnd=s.length;
    while(i<iEnd && j<jEnd ){
        if(g[i]>s[j]){
            j++
        }
        else{
            i++
            j++
            count++
        }
    }
    return count
};