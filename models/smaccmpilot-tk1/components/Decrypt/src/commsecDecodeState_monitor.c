/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.5
 */
#include "commsecDecodeState_monitor.h"

bool validkey = false;

struct gec_sym_key ctx_dl_global_gec_sym_key_dec;

void callback_gec_decode_init(const uint8_t n_var0[24U])
{
    ctx_dl_decode_init(n_var0);
    validkey = true;
}

void callback_cyphertext_decode(const uint8_t n_var0[96U])
{
    bool n_deref0 = validkey;
    
    if (n_deref0) {
        uint8_t n_local1[80U] = {};
        uint8_t *n_ref2 = n_local1;
        uint32_t n_r3 = ctx_dl_decode_run(n_var0, n_ref2);
        
        if ((bool) (0 == n_r3)) {
            callback_output_tb_self2server_enqueue_2(n_ref2);
        }
    }
}

void ctx_dl_decode_init(const uint8_t n_var0[24U])
{
    gec_init_sym_key_conf_auth(&ctx_dl_global_gec_sym_key_dec, n_var0);
}

uint32_t ctx_dl_decode_run(const uint8_t n_var0[96U], uint8_t n_var1[80U])
{
    uint32_t n_r0 = gec_decrypt(&ctx_dl_global_gec_sym_key_dec, n_var0, n_var1);
    
    return n_r0;
}
