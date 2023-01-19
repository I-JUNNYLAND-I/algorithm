/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @param {number[]} nums3
 * @return {number[]}
 */
var twoOutOfThree = function(nums1, nums2, nums3) {
    let allNums=new Set([...nums1,...nums2,...nums3])
    let res=[]
    let count=0
    allNums.forEach((v)=>{
        if(nums1.includes(v))count++
        if(nums2.includes(v))count++
        if(nums3.includes(v))count++
        
        if(count>=2) res.push(v)
        count=0
    })
    
   return res
};