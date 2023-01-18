/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @return {number[]}
 */
var relativeSortArray = function(arr1, arr2) {
    let tempStack=[]
    let i=0
    let tempStack2=[]
    for(let i=0;i<arr2.length;i++){
        for(let j=0;j<arr1.length;j++){
            if(arr2[i]===arr1[j]){
                tempStack.push(arr2[i])
            }
        }
    }
    for(let i=0;i<arr1.length;i++){
        if (!arr2.includes(arr1[i])){
             tempStack2.push(arr1[i])   
            }
    }
    
    return [...tempStack,...tempStack2.sort((a,b)=>a-b)]
};