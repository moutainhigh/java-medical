import request from '@/util/request'

//  登录  -接口

// 列表
export function loginRequest (riid) {
  return request({
    url: '/api/admin/login',
    method: 'post',
    data: riid
  })
}
