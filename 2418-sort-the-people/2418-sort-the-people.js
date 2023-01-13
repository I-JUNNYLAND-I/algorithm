/**
 * @param {string[]} names
 * @param {number[]} heights
 * @return {string[]}
 */
var sortPeople = function(names, heights) {
    let newArr=[]
    names.forEach((v,i)=>{
        newArr.push([names[i],heights[i]])
    })
    
    newArr.sort((a,b)=>b[1]-a[1])
    
    return newArr.map((v)=>v[0])
};