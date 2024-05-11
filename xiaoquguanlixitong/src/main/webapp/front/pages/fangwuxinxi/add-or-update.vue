
<template>
	<view class="content">
		<form class="app-update-pv">
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                      class="title">房屋名称</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 16rpx #F37335 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"20rpx","color":"#FE8010","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.fangwuxinxiName" type="text" v-model="ruleForm.fangwuxinxiName" placeholder="房屋名称"></input>
            </view>
                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group" @tap="fangwuxinxiPhotoTap">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                          class="title">房屋图片</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="ruleForm.fangwuxinxiPhoto" :src="ruleForm.fangwuxinxiPhoto" mode="aspectFill">
                        </image>
                        <image  :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
			                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                          class="title">房屋类型</view>
                    <picker @change="fangwuxinxiTypesChange" :value="fangwuxinxiTypesIndex" :range="fangwuxinxiTypesOptions" range-key="indexName">
                        <view
                                :style='{"boxShadow":"0 0 16rpx #F37335 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"20rpx","color":"#FE8010","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.fangwuxinxiTypes?ruleForm.fangwuxinxiValue:"请选择房屋类型"}}</view>
                    </picker>
                </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                      class="title">房屋大小</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 16rpx #F37335 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"20rpx","color":"#FE8010","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.fangwuxinxiSize" type="text" v-model="ruleForm.fangwuxinxiSize" placeholder="房屋大小"></input>
            </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                      class="title">房屋布局</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 16rpx #F37335 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"20rpx","color":"#FE8010","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.fangwuxinxiBuju" type="text" v-model="ruleForm.fangwuxinxiBuju" placeholder="房屋布局"></input>
            </view>
<!-- text后缀 -->
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                      class="title">详情</view>
                <textarea :style='{"boxShadow":"0 0 16rpx #F37335 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"20rpx","color":"#FE8010","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
                          :disabled="ro.fangwuxinxiContent" v-model="ruleForm.fangwuxinxiContent" placeholder="详情"/>
            </view>

			<view class="btn">
				<button
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#FE8010","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
					@tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
						  ref="createTime" themeColor="#333333"></w-picker>


	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross: '',
                ro:{
					fangwuxinxiName: false,
					fangwuxinxiPhoto: false,
					fangwuxinxiTypes: false,
					fangwuxinxiSize: false,
					fangwuxinxiBuju: false,
					fangwuxinxiContent: false,
					createTime: false,
				},
				ruleForm: {
					fangwuxinxiName: '',
					fangwuxinxiPhoto: '',
					fangwuxinxiTypes: '',//数字
					fangwuxinxiValue: '',//数字对应的值
					fangwuxinxiSize: '',
					fangwuxinxiBuju: '',
					fangwuxinxiContent: '',
					createTime: '',
				},
				// 登陆用户信息
				user: {},
				fangwuxinxiTypesOptions: [],
				fangwuxinxiTypesIndex : 0,

			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {

		/*下拉框*/
			let fangwuxinxiTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'fangwuxinxi_types',
			}
			let fangwuxinxiTypes = await this.$api.page(`dictionary`, fangwuxinxiTypesParams);
			this.fangwuxinxiTypesOptions = fangwuxinxiTypes.data.list


			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				let res = await this.$api.info(`fangwuxinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			if(options.fangwuxinxiId){
                this.ruleForm.fangwuxinxiId = options.fangwuxinxiId;
			}
			// 跨表
			// this.styleChange()
		},
		methods: {
			// 下拉变化
            fangwuxinxiTypesChange(e) {
            this.fangwuxinxiTypesIndex = e.target.value
            this.ruleForm.fangwuxinxiValue = this.fangwuxinxiTypesOptions[this.fangwuxinxiTypesIndex].indexName
            this.ruleForm.fangwuxinxiTypes = this.fangwuxinxiTypesOptions[this.fangwuxinxiTypesIndex].codeIndex
        },


			// styleChange() {
			// 	this.$nextTick(() => {
			// 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
			// 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
			// 		// })
			// 	})
			// },


			fangwuxinxiPhotoTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.fangwuxinxiPhoto = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(() => {
						// _this.styleChange()
					})
				});
			},
			// 日期控件
			createTimeConfirm(val) {
                console.log(val)
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },




			getUUID() {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if ((!this.ruleForm.fangwuxinxiName)) {
					this.$utils.msg(`房屋名称不能为空`);
					return
				}
				if ((!this.ruleForm.fangwuxinxiPhoto)) {
					this.$utils.msg(`房屋图片不能为空`);
					return
				}
				if ((!this.ruleForm.fangwuxinxiSize)) {
					this.$utils.msg(`房屋大小不能为空`);
					return
				}
				if ((!this.ruleForm.fangwuxinxiBuju)) {
					this.$utils.msg(`房屋布局不能为空`);
					return
				}
				if (this.ruleForm.id) {
					await this.$api.update(`fangwuxinxi`, this.ruleForm);
				} else {
					await this.$api.save(`fangwuxinxi`, this.ruleForm);
				}
                uni.setStorageSync('pingluenStateState', true);
                this.$utils.msgBack('提交成功');
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}

	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}

	.cu-form-group.active {
		justify-content: space-between;
	}

	.btn {
		display: flex;
		align-items: center;
		justify-content: center;
		flex-wrap: wrap;
		padding: 20upx 0;
	}

	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}

	.cu-form-group+.cu-form-group {
		border: 0;
	}

	.cu-form-group uni-input {
		padding: 0 30upx;
	}

	.uni-input {
		padding: 0 30upx;
	}

	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}

	.cu-form-group uni-picker::after {
		line-height: 68rpx;
	}

	.select .uni-input {
		line-height: 68rpx;
	}

	.input .right-input {
		line-height: 68rpx;
	}
</style>