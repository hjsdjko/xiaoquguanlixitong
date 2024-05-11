<template>
	<view class="content">
		<form class="app-update-pv">
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}' class="title">
					维修设施</view>
				<input disabled
					:style='{"boxShadow":"0 0 16rpx #F37335 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"20rpx","color":"#FE8010","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.ruzhudengjiName" type="text" v-model="ruleForm.ruzhudengjiName"
					placeholder="维修设施"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}' class="title">
					设施类型</view>
				<picker @change="guzhangweixiuTypesChange" :value="guzhangweixiuTypesIndex"
					:range="guzhangweixiuTypesOptions" range-key="indexName">
					<view
						:style='{"boxShadow":"0 0 16rpx #F37335 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"20rpx","color":"#FE8010","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
						class="uni-input">{{ruleForm.guzhangweixiuTypes?ruleForm.guzhangweixiuValue:"请选择设施类型"}}</view>
				</picker>
			</view>
			<!-- text后缀 -->
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}' class="title">
					详细地址</view>
				<textarea
					:style='{"boxShadow":"0 0 16rpx #F37335 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"20rpx","color":"#FE8010","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
					:disabled="ro.ruzhudengjiText" v-model="ruleForm.ruzhudengjiText" placeholder="详细地址" />
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
				ro: {
					yonghuId: false,
					ruzhudengjiName: false,
					guzhangweixiuTypes: false,
					ruzhudengjiText: false,
					guzhangweixiuYesnoTypes: false,
					guzhangweixiuYesnoText: false,
					createTime: false,
				},
				ruleForm: {
					yonghuId: '',
					ruzhudengjiName: '',
					guzhangweixiuTypes: '', //数字
					guzhangweixiuValue: '', //数字对应的值
					ruzhudengjiText: '',
					guzhangweixiuYesnoTypes: '', //数字
					guzhangweixiuYesnoValue: '', //数字对应的值
					guzhangweixiuYesnoText: '',
					createTime: '',
				},
				// 登陆用户信息
				user: {},
				guzhangweixiuTypesOptions: [],
				guzhangweixiuTypesIndex: 0,
				guzhangweixiuYesnoTypesOptions: [],
				guzhangweixiuYesnoTypesIndex: 0,

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
			let guzhangweixiuTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'guzhangweixiu_types',
			}
			let guzhangweixiuTypes = await this.$api.page(`dictionary`, guzhangweixiuTypesParams);
			this.guzhangweixiuTypesOptions = guzhangweixiuTypes.data.list
			/*下拉框*/
			let guzhangweixiuYesnoTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'guzhangweixiu_yesno_types',
			}
			let guzhangweixiuYesnoTypes = await this.$api.page(`dictionary`, guzhangweixiuYesnoTypesParams);
			this.guzhangweixiuYesnoTypesOptions = guzhangweixiuYesnoTypes.data.list


			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				let res = await this.$api.info(`guzhangweixiu`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			if (options.guzhangweixiuId) {
				this.ruleForm.guzhangweixiuId = options.guzhangweixiuId;
			}
			// 跨表
			// this.styleChange()
		},
		methods: {
			// 下拉变化
			guzhangweixiuTypesChange(e) {
				this.guzhangweixiuTypesIndex = e.target.value
				this.ruleForm.guzhangweixiuValue = this.guzhangweixiuTypesOptions[this.guzhangweixiuTypesIndex].indexName
				this.ruleForm.guzhangweixiuTypes = this.guzhangweixiuTypesOptions[this.guzhangweixiuTypesIndex].codeIndex
			},
			guzhangweixiuYesnoTypesChange(e) {
				this.guzhangweixiuYesnoTypesIndex = e.target.value
				this.ruleForm.guzhangweixiuYesnoValue = this.guzhangweixiuYesnoTypesOptions[this
					.guzhangweixiuYesnoTypesIndex].indexName
				this.ruleForm.guzhangweixiuYesnoTypes = this.guzhangweixiuYesnoTypesOptions[this
					.guzhangweixiuYesnoTypesIndex].codeIndex
			},


			// styleChange() {
			// 	this.$nextTick(() => {
			// 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
			// 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
			// 		// })
			// 	})
			// },


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
				if ((!this.ruleForm.ruzhudengjiName)) {
					this.$utils.msg(`维修设施不能为空`);
					return
				}
				if ((!this.ruleForm.ruzhudengjiText)) {
					this.$utils.msg(`详细地址不能为空`);
					return
				}
				if (this.ruleForm.id) {
					await this.$api.update(`guzhangweixiu`, this.ruleForm);
				} else {
					await this.$api.save(`guzhangweixiu`, this.ruleForm);
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
