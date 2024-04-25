import request from "@/utils/request.js"

export const login = (data) => {
    console.log("请求登录")
    return request(
        {
            method: "POST",
            url: "/login",
            data: {
                username,
                password
            }
        }
    )
}