class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        # 주어진 단어가, 외계인의 사전순으로 정렬이 되었는가? 
        def convert(ref: dict, keys: str):
            result = []
            for key in keys: 
                result.append(ref[key])
            return result
        arr = [x for x in range (1, len(order) + 1)]
        number_to_alphabet = dict(zip(arr, order))
        alphabet_to_number = dict(zip(order, arr))
        temp = []
        for word in words:
            temp.append(convert(alphabet_to_number, word))
            
        temp.sort()
        for i in range(len(temp)):
            temp[i] = "".join(convert(number_to_alphabet, temp[i]))
        
        return temp == words
    