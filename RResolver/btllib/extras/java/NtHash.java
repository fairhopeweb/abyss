/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package btllib;

public class NtHash {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NtHash(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NtHash obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        btllibJNI.delete_NtHash(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public NtHash(String seq, long hash_num, long k, long pos) {
    this(btllibJNI.new_NtHash__SWIG_0(seq, hash_num, k, pos), true);
  }

  public NtHash(String seq, long hash_num, long k) {
    this(btllibJNI.new_NtHash__SWIG_1(seq, hash_num, k), true);
  }

  public boolean roll() {
    return btllibJNI.NtHash_roll(swigCPtr, this);
  }

  public void sub(SWIGTYPE_p_std__vectorT_unsigned_int_t positions, SWIGTYPE_p_std__vectorT_unsigned_char_t new_bases) {
    btllibJNI.NtHash_sub(swigCPtr, this, SWIGTYPE_p_std__vectorT_unsigned_int_t.getCPtr(positions), SWIGTYPE_p_std__vectorT_unsigned_char_t.getCPtr(new_bases));
  }

  public SWIGTYPE_p_unsigned_long_long hashes() {
    long cPtr = btllibJNI.NtHash_hashes(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public long get_pos() {
    return btllibJNI.NtHash_get_pos(swigCPtr, this);
  }

  public boolean forward() {
    return btllibJNI.NtHash_forward(swigCPtr, this);
  }

  public long get_hash_num() {
    return btllibJNI.NtHash_get_hash_num(swigCPtr, this);
  }

  public long get_k() {
    return btllibJNI.NtHash_get_k(swigCPtr, this);
  }

  public java.math.BigInteger get_forward_hash() {
    return btllibJNI.NtHash_get_forward_hash(swigCPtr, this);
  }

  public java.math.BigInteger get_reverse_hash() {
    return btllibJNI.NtHash_get_reverse_hash(swigCPtr, this);
  }

}
