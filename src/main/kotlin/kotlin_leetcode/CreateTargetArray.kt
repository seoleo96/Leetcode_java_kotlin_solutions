package kotlin_leetcode

import java.util.Arrays


fun main() {
    val nums = intArrayOf(0, 1, 2, 3, 4)
    val index = intArrayOf(0, 1, 2, 2, 1)
    val res = CreateTargetArray().createTargetArray(nums, index)
    println(res.contentToString())
}


class CreateTargetArray {
    fun createTargetArray(
        nums: IntArray,
        index: IntArray
    ): IntArray {
        val size = nums.size
        val res = IntArray(size)
        for (i in nums.indices){
            if(index[i] <= i){
                for (j in size-1 downTo index[i]+1 step 1){
                    res[j] = res[j-1]
                }
            }
            res[index[i]] = nums[i]
        }
        return res
    }
}

