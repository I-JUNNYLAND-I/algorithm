/**
 * @param {number[]} g
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    console.log(g,s)

    g.sort((a,b)=>a-b)
    s.sort((a,b)=>a-b)
    let j=0
    let count=0

    // while(i<iEnd && j<jEnd ){
    //     if(g[i]>s[j]){
    //         j++
    //     }
    //     else{
    //         i++
    //         j++
    //         count++
    //     }
    // }
    for(let num of s){
        if(num>=g[j]) {j++
                       count++}
    }
    return count
};