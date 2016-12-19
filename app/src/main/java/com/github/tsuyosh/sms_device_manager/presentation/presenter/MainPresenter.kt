package com.github.tsuyosh.sms_device_manager.presentation.presenter

import com.github.tsuyosh.sms_device_manager.domain.entity.Device
import com.github.tsuyosh.sms_device_manager.presentation.contract.MainContract

/**
 * Created by tsuyosh on 16/12/19.
 */
class MainPresenter : MainContract.Presenter {
    private var view:MainContract.View? = null

    override fun onStart() {
        loadDeviceList()
    }

    override fun onStop() {
    }

    override fun onMapReady() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadDeviceList() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadLocation(targetDevice: Device) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun playRingtone(targetDevice: Device) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lock(targetDevice: Device) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun erase(targetDevice: Device) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}