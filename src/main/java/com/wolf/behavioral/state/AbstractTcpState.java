package com.wolf.behavioral.state;

/**
 * <b>εθ½</b>
 *
 * @author ζθΆ
 * @Date 2016/7/17
 */
public abstract class AbstractTcpState implements TcpState {

	@Override
	public void activeOpen(TcpConnection tcpConnection) {

	}

	@Override
	public void passiveOpen(TcpConnection tcpConnection) {

	}

	@Override
	public void transmit(TcpConnection tcpConnection, String data) {

	}

	@Override
	public void send(TcpConnection tcpConnection) {

	}

	@Override
	public void changeState(TcpConnection tcpConnection, TcpState tcpState) {

	}

	@Override
	public void close(TcpConnection tcpConnection) {

	}

}
