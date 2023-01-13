/**
 * @param {number[]} ranks
 * @param {character[]} suits
 * @return {string}
 */
var bestHand = function(ranks, suits) {
    if(suits.length===suits.filter((v,i)=>suits[0]===v).length) return "Flush"
    
    let dict={}
    for(let i=0;i<ranks.length;i++){
        dict[ranks[i]]?dict[ranks[i]]+=1:dict[ranks[i]]=1
    }
    let max=-1
    for(value of Object.values(dict))
    {
        if(value>max) max=value
    }
    if(max>=3) return "Three of a Kind"
    if(max===2) return "Pair"
    return "High Card"
    
    
};