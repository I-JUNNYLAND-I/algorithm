/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    let res=[]
    
    nums1.forEach((v)=>{
        if(nums2.includes(v)&& !res.includes(v)){
            res.push(v)
        }
    })
    return (res)
};