package com.wolf.behavioral.state;

/**
 * <b>εθ½</b>
 * TCPConnection itself doesn't know a thing about the TCP connection protocol; it's the TCPState
 * subclasses that define each state transition and action in TCP.
 *
 *  It is generally more flexible and appropriate, however, to let the State subclasses
 *  themselves specify their successor state and when to make the transition.
 *
 *  A table-based alternative.
 *
 * @author ζθΆ
 * @Date 2016/7/17
 */
public interface TcpState {

	public void activeOpen(TcpConnection tcpConnection);
	public void passiveOpen(TcpConnection tcpConnection);
	public void transmit(TcpConnection tcpConnection, String data);
	public void send(TcpConnection tcpConnection);
	public void changeState(TcpConnection tcpConnection, TcpState tcpState);
	public void close(TcpConnection tcpConnection);
}
