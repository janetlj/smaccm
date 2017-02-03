/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.5
 */
#ifndef __FRAME_DATALINK_ENCODE_MONITOR_H__
#define __FRAME_DATALINK_ENCODE_MONITOR_H__
#ifdef __cplusplus
extern "C" {
#endif
#include "ivory.h"
#include "hx_cyphertext.h"
#include "smaccm_UART_module.h"
#include "towerUartDeps.h"
#include "frame_datalink_encode_monitor.h"
#include "send_transdata_monitor.h"
#include "hxstream_state_module.h"
#include "ivory_serialize.h"
extern int32_t datalink_encode_ringbuffer_insert;
extern int32_t datalink_encode_ringbuffer_remove;
extern uint8_t datalink_encode_ringbuffer_buf[4U][96U];
extern bool pending;
void callback_encoder_ct_push(const uint8_t n_var0[96U]);
void callback_periodic_encoder_ct_pop(const int64_t *n_var0);
void callback_encoder_ct_output(const uint8_t n_var0[96U]);
void callback_complete(const bool *n_var0);
bool datalink_encode_ringbuffer_push(const uint8_t n_var0[96U]);
bool datalink_encode_ringbuffer_pop(uint8_t n_var0[96U]);

#ifdef __cplusplus
}
#endif
#endif /* __FRAME_DATALINK_ENCODE_MONITOR_H__ */
