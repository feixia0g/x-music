import axios from 'axios'

// this.$store.state.configure.HOST
const host = 'http://localhost:8888'
export default {
  /**
   * @msg: 登录
   * @param {String} username
   * @param {String} password
   * @return: {Promise}
   */
  loginIn(username, password) {
    let params = new URLSearchParams()
    params.append('username', username)
    params.append('password', password)
    return axios.post(`${host}/user/login/status`, params)
  },

  /**
   * @msg: 注册
   * @param {String} username
   * @param {String} password
   * @param {String} sex
   * @param {Number} phoneNum
   * @param {String} email
   * @param {String} datetime
   * @param {String} introduction
   * @param {String} location
   * @return: {Promise}
   */
  loginUp(username, password, sex, phoneNum, email, datetime, introduction, location, avator) {
    const data = {};

    var params = new URLSearchParams()
    params.append('username', username)
    params.append('password', password)
    params.append('sex', sex)
    params.append('phone_num', phoneNum)
    params.append('email', email)
    params.append('birth', datetime)
    params.append('introduction', introduction)
    params.append('location', location)
    params.append('avator', avator)

    // 遍历所有参数的键值对，将其添加到JavaScript对象中
    for (const [key, value] of params.entries()) {
      data[key] = value;
    }

    // 将JavaScript对象转换为JSON字符串
    const jsonData = JSON.stringify(data);

    return axios.post(`${host}/user/add`, jsonData, {
      headers: {
        'Content-Type': 'application/json'
      }
    })
  },

  /**
   * @msg: 更新用户信息
   * @param {Number} userId
   * @return: {Promise}
   */
  updateUserMsg(userId, username, password, sex, phoneNum, email, datetime, introduction, location) {
    var params = new URLSearchParams()
    params.append('id', userId)
    params.append('username', username)
    params.append('password', password)
    params.append('sex', sex)
    params.append('phone_num', phoneNum)
    params.append('email', email)
    params.append('birth', datetime)
    params.append('introduction', introduction)
    params.append('location', location)
    return axios.post(`${host}/user/update`, params)
  },

  /**
   * @msg: 返回指定ID的用户
   * @param {Number} id
   * @return: {Promise}
   */
  getUserOfId(id) {
    return axios.get(`${host}/user/detail?id=${id}`)
  }
}
