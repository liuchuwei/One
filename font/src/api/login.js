import request from "@/utils/request.js"

export function login(username, password) {
    return request({
        url: '/login',
        method: 'post',
        data: {
            username,
            password
        }
    })
}

export function getInfo() {
    return request({
        url: '/info',
        method: 'get',
    })
}

export function logout() {
    return request({
        url: '/logout',
        method: 'post'
    })
}