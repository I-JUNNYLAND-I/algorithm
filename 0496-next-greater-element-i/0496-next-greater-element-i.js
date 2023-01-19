/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var nextGreaterElement = function(nums1, nums2) {
    let res=Array(nums1.length).fill(0)
    let index=-1
    for(let i=0;i<nums1.length;i++){
        index=nums2.indexOf(nums1[i])
        for(let j=index;j<nums2.length;j++){
            if(nums1[i]<nums2[j]) {
                res[i]=nums2[j]
                break;
            }
        }
        if(res[i]===0) res[i]=-1
    }
    return res
};