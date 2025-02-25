/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package btllib;

public class btllibJNI {
  public final static native long SeqReader_SeqReaderFlag_FOLD_CASE_get();
  public final static native long SeqReader_SeqReaderFlag_TRIM_MASKED_get();
  public final static native long SeqReader_SeqReaderFlag_SHORT_MODE_get();
  public final static native long SeqReader_SeqReaderFlag_LONG_MODE_get();
  public final static native long new_SeqReaderFlag();
  public final static native void delete_SeqReader_SeqReaderFlag(long jarg1);
  public final static native long new_SeqReader__SWIG_0(String jarg1, long jarg2, long jarg3);
  public final static native long new_SeqReader__SWIG_1(String jarg1, long jarg2);
  public final static native void delete_SeqReader(long jarg1);
  public final static native void SeqReader_close(long jarg1, SeqReader jarg1_);
  public final static native boolean SeqReader_fold_case(long jarg1, SeqReader jarg1_);
  public final static native boolean SeqReader_trim_masked(long jarg1, SeqReader jarg1_);
  public final static native boolean SeqReader_short_mode(long jarg1, SeqReader jarg1_);
  public final static native boolean SeqReader_long_mode(long jarg1, SeqReader jarg1_);
  public final static native int SeqReader_get_format(long jarg1, SeqReader jarg1_);
  public final static native void SeqReader_SeqReaderRecord_num_set(long jarg1, SeqReader.SeqReaderRecord jarg1_, long jarg2);
  public final static native long SeqReader_SeqReaderRecord_num_get(long jarg1, SeqReader.SeqReaderRecord jarg1_);
  public final static native void SeqReader_SeqReaderRecord_id_set(long jarg1, SeqReader.SeqReaderRecord jarg1_, String jarg2);
  public final static native String SeqReader_SeqReaderRecord_id_get(long jarg1, SeqReader.SeqReaderRecord jarg1_);
  public final static native void SeqReader_SeqReaderRecord_comment_set(long jarg1, SeqReader.SeqReaderRecord jarg1_, String jarg2);
  public final static native String SeqReader_SeqReaderRecord_comment_get(long jarg1, SeqReader.SeqReaderRecord jarg1_);
  public final static native void SeqReader_SeqReaderRecord_seq_set(long jarg1, SeqReader.SeqReaderRecord jarg1_, String jarg2);
  public final static native String SeqReader_SeqReaderRecord_seq_get(long jarg1, SeqReader.SeqReaderRecord jarg1_);
  public final static native void SeqReader_SeqReaderRecord_qual_set(long jarg1, SeqReader.SeqReaderRecord jarg1_, String jarg2);
  public final static native String SeqReader_SeqReaderRecord_qual_get(long jarg1, SeqReader.SeqReaderRecord jarg1_);
  public final static native long new_SeqReaderRecord();
  public final static native void delete_SeqReader_SeqReaderRecord(long jarg1);
  public final static native long SeqReader_read(long jarg1, SeqReader jarg1_);
  public final static native long SeqReader_MAX_SIMULTANEOUS_SEQREADERS_get();
  public final static native long SeqReader_RecordIterator_next(long jarg1, SeqReader.RecordIterator jarg1_);
  public final static native void delete_SeqReader_RecordIterator(long jarg1);
  public final static native long SeqReader_begin(long jarg1, SeqReader jarg1_);
  public final static native long SeqReader_end(long jarg1, SeqReader jarg1_);
  public final static native long BIT_MASKS_get();
  public final static native String KMER_BLOOM_FILTER_MAGIC_HEADER_get();
  public final static native String SEED_BLOOM_FILTER_MAGIC_HEADER_get();
  public final static native String HASH_FN_get();
  public final static native long MAX_HASH_VALUES_get();
  public final static native long PLACEHOLDER_NEWLINES_get();
  public final static native long pop_cnt_byte(short jarg1);
  public final static native long new_BloomFilter__SWIG_0();
  public final static native long new_BloomFilter__SWIG_1(long jarg1, long jarg2, String jarg3);
  public final static native long new_BloomFilter__SWIG_2(long jarg1, long jarg2);
  public final static native long new_BloomFilter__SWIG_3(String jarg1);
  public final static native void BloomFilter_insert__SWIG_0(long jarg1, BloomFilter jarg1_, long jarg2);
  public final static native void BloomFilter_insert__SWIG_1(long jarg1, BloomFilter jarg1_, long jarg2);
  public final static native boolean BloomFilter_contains__SWIG_0(long jarg1, BloomFilter jarg1_, long jarg2);
  public final static native boolean BloomFilter_contains__SWIG_1(long jarg1, BloomFilter jarg1_, long jarg2);
  public final static native boolean BloomFilter_contains_insert__SWIG_0(long jarg1, BloomFilter jarg1_, long jarg2);
  public final static native boolean BloomFilter_contains_insert__SWIG_1(long jarg1, BloomFilter jarg1_, long jarg2);
  public final static native long BloomFilter_get_bytes(long jarg1, BloomFilter jarg1_);
  public final static native java.math.BigInteger BloomFilter_get_pop_cnt(long jarg1, BloomFilter jarg1_);
  public final static native double BloomFilter_get_occupancy(long jarg1, BloomFilter jarg1_);
  public final static native long BloomFilter_get_hash_num(long jarg1, BloomFilter jarg1_);
  public final static native double BloomFilter_get_fpr(long jarg1, BloomFilter jarg1_);
  public final static native String BloomFilter_get_hash_fn(long jarg1, BloomFilter jarg1_);
  public final static native void BloomFilter_save__SWIG_0(long jarg1, BloomFilter jarg1_, String jarg2);
  public final static native void BloomFilter_save__SWIG_1(String jarg1, long jarg2, String jarg3, long jarg4);
  public final static native void delete_BloomFilter(long jarg1);
  public final static native long new_KmerBloomFilter__SWIG_0();
  public final static native long new_KmerBloomFilter__SWIG_1(long jarg1, long jarg2, long jarg3);
  public final static native long new_KmerBloomFilter__SWIG_2(String jarg1);
  public final static native void KmerBloomFilter_insert__SWIG_0(long jarg1, KmerBloomFilter jarg1_, String jarg2, long jarg3);
  public final static native void KmerBloomFilter_insert__SWIG_1(long jarg1, KmerBloomFilter jarg1_, String jarg2);
  public final static native void KmerBloomFilter_insert__SWIG_2(long jarg1, KmerBloomFilter jarg1_, long jarg2);
  public final static native void KmerBloomFilter_insert__SWIG_3(long jarg1, KmerBloomFilter jarg1_, long jarg2);
  public final static native long KmerBloomFilter_contains__SWIG_0(long jarg1, KmerBloomFilter jarg1_, String jarg2, long jarg3);
  public final static native long KmerBloomFilter_contains__SWIG_1(long jarg1, KmerBloomFilter jarg1_, String jarg2);
  public final static native boolean KmerBloomFilter_contains__SWIG_2(long jarg1, KmerBloomFilter jarg1_, long jarg2);
  public final static native boolean KmerBloomFilter_contains__SWIG_3(long jarg1, KmerBloomFilter jarg1_, long jarg2);
  public final static native long KmerBloomFilter_contains_insert__SWIG_0(long jarg1, KmerBloomFilter jarg1_, String jarg2, long jarg3);
  public final static native long KmerBloomFilter_contains_insert__SWIG_1(long jarg1, KmerBloomFilter jarg1_, String jarg2);
  public final static native boolean KmerBloomFilter_contains_insert__SWIG_2(long jarg1, KmerBloomFilter jarg1_, long jarg2);
  public final static native boolean KmerBloomFilter_contains_insert__SWIG_3(long jarg1, KmerBloomFilter jarg1_, long jarg2);
  public final static native long KmerBloomFilter_get_bytes(long jarg1, KmerBloomFilter jarg1_);
  public final static native java.math.BigInteger KmerBloomFilter_get_pop_cnt(long jarg1, KmerBloomFilter jarg1_);
  public final static native double KmerBloomFilter_get_occupancy(long jarg1, KmerBloomFilter jarg1_);
  public final static native long KmerBloomFilter_get_hash_num(long jarg1, KmerBloomFilter jarg1_);
  public final static native double KmerBloomFilter_get_fpr(long jarg1, KmerBloomFilter jarg1_);
  public final static native long KmerBloomFilter_get_k(long jarg1, KmerBloomFilter jarg1_);
  public final static native String KmerBloomFilter_get_hash_fn(long jarg1, KmerBloomFilter jarg1_);
  public final static native long KmerBloomFilter_get_bloom_filter(long jarg1, KmerBloomFilter jarg1_);
  public final static native void KmerBloomFilter_save(long jarg1, KmerBloomFilter jarg1_, String jarg2);
  public final static native void delete_KmerBloomFilter(long jarg1);
  public final static native long new_SeedBloomFilter__SWIG_0();
  public final static native long new_SeedBloomFilter__SWIG_1(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long new_SeedBloomFilter__SWIG_2(String jarg1);
  public final static native void SeedBloomFilter_insert__SWIG_0(long jarg1, SeedBloomFilter jarg1_, String jarg2, long jarg3);
  public final static native void SeedBloomFilter_insert__SWIG_1(long jarg1, SeedBloomFilter jarg1_, String jarg2);
  public final static native void SeedBloomFilter_insert__SWIG_2(long jarg1, SeedBloomFilter jarg1_, long jarg2);
  public final static native void SeedBloomFilter_insert__SWIG_3(long jarg1, SeedBloomFilter jarg1_, long jarg2);
  public final static native long SeedBloomFilter_contains__SWIG_0(long jarg1, SeedBloomFilter jarg1_, String jarg2, long jarg3);
  public final static native long SeedBloomFilter_contains__SWIG_1(long jarg1, SeedBloomFilter jarg1_, String jarg2);
  public final static native boolean SeedBloomFilter_contains__SWIG_2(long jarg1, SeedBloomFilter jarg1_, long jarg2);
  public final static native boolean SeedBloomFilter_contains__SWIG_3(long jarg1, SeedBloomFilter jarg1_, long jarg2);
  public final static native long SeedBloomFilter_contains_insert__SWIG_0(long jarg1, SeedBloomFilter jarg1_, String jarg2, long jarg3);
  public final static native long SeedBloomFilter_contains_insert__SWIG_1(long jarg1, SeedBloomFilter jarg1_, String jarg2);
  public final static native boolean SeedBloomFilter_contains_insert__SWIG_2(long jarg1, SeedBloomFilter jarg1_, long jarg2);
  public final static native boolean SeedBloomFilter_contains_insert__SWIG_3(long jarg1, SeedBloomFilter jarg1_, long jarg2);
  public final static native long SeedBloomFilter_get_bytes(long jarg1, SeedBloomFilter jarg1_);
  public final static native java.math.BigInteger SeedBloomFilter_get_pop_cnt(long jarg1, SeedBloomFilter jarg1_);
  public final static native double SeedBloomFilter_get_occupancy(long jarg1, SeedBloomFilter jarg1_);
  public final static native long SeedBloomFilter_get_total_hash_num(long jarg1, SeedBloomFilter jarg1_);
  public final static native double SeedBloomFilter_get_fpr(long jarg1, SeedBloomFilter jarg1_);
  public final static native long SeedBloomFilter_get_k(long jarg1, SeedBloomFilter jarg1_);
  public final static native long SeedBloomFilter_get_seeds(long jarg1, SeedBloomFilter jarg1_);
  public final static native long SeedBloomFilter_get_parsed_seeds(long jarg1, SeedBloomFilter jarg1_);
  public final static native long SeedBloomFilter_get_hash_num_per_seed(long jarg1, SeedBloomFilter jarg1_);
  public final static native long SeedBloomFilter_get_hash_num(long jarg1, SeedBloomFilter jarg1_);
  public final static native String SeedBloomFilter_get_hash_fn(long jarg1, SeedBloomFilter jarg1_);
  public final static native long SeedBloomFilter_get_kmer_bloom_filter(long jarg1, SeedBloomFilter jarg1_);
  public final static native void SeedBloomFilter_save(long jarg1, SeedBloomFilter jarg1_, String jarg2);
  public final static native void delete_SeedBloomFilter(long jarg1);
  public final static native String COMPLEMENTS_get();
  public final static native String CAPITALS_get();
  public final static native void reverse_complement(long jarg1);
  public final static native String get_reverse_complement(String jarg1);
  public final static native int PIPE_READ_END_get();
  public final static native int PIPE_WRITE_END_get();
  public final static native int COMM_BUFFER_SIZE_get();
  public final static native long OPEN_MODE_get();
  public final static native void run_cmd();
  public final static native void end_cmd();
  public final static native void process_spawner_operation();
  public final static native long process_spawner_initialized();
  public final static native long process_spawner_user2spawner_fd();
  public final static native long process_spawner_spawner2user_fd();
  public final static native long process_spawner_comm_mutex();
  public final static native long new_pipe_id();
  public final static native long pipepath_prefix();
  public final static native long new_pipeline_id();
  public final static native long pipeline_map();
  public final static native boolean process_spawner_init();
  public final static native boolean PROCESS_PIPELINE_INITIALIZER_get();
  public final static native String get_pipepath(long jarg1);
  public final static native long extract_io_redirection(long jarg1);
  public final static native void open_comm_pipes(long jarg1, long jarg2);
  public final static native void redirect_io(int jarg1, int jarg2, int jarg3);
  public final static native void assign_process_cmd(long jarg1);
  public final static native void rm_pipes();
  public final static native boolean check_child_failure__SWIG_0(int jarg1, long jarg2, String jarg3);
  public final static native boolean check_child_failure__SWIG_1(int jarg1, long jarg2);
  public final static native boolean check_children_failures();
  public final static native void install_signal_handlers_spawner();
  public final static native void set_comm_pipes(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native void open_redirection_files(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void set_pipepath_prefix();
  public final static native long start_watchdog();
  public final static native void closefile(long jarg1);
  public final static native String KMER_COUNTING_BLOOM_FILTER_MAGIC_HEADER_get();
  public final static native long Indexlr_IndexlrFlag_NO_ID_get();
  public final static native long Indexlr_IndexlrFlag_BX_get();
  public final static native long Indexlr_IndexlrFlag_SEQ_get();
  public final static native long Indexlr_IndexlrFlag_FILTER_IN_get();
  public final static native long Indexlr_IndexlrFlag_FILTER_OUT_get();
  public final static native long Indexlr_IndexlrFlag_SHORT_MODE_get();
  public final static native long Indexlr_IndexlrFlag_LONG_MODE_get();
  public final static native long new_IndexlrFlag();
  public final static native void delete_Indexlr_IndexlrFlag(long jarg1);
  public final static native boolean Indexlr_output_id(long jarg1, Indexlr jarg1_);
  public final static native boolean Indexlr_output_bx(long jarg1, Indexlr jarg1_);
  public final static native boolean Indexlr_output_seq(long jarg1, Indexlr jarg1_);
  public final static native boolean Indexlr_filter_in(long jarg1, Indexlr jarg1_);
  public final static native boolean Indexlr_filter_out(long jarg1, Indexlr jarg1_);
  public final static native boolean Indexlr_short_mode(long jarg1, Indexlr jarg1_);
  public final static native boolean Indexlr_long_mode(long jarg1, Indexlr jarg1_);
  public final static native long new_Indexlr_Minimizer__SWIG_0();
  public final static native long new_Indexlr_Minimizer__SWIG_1(java.math.BigInteger jarg1, java.math.BigInteger jarg2, long jarg3, boolean jarg4, String jarg5);
  public final static native void Indexlr_Minimizer_min_hash_set(long jarg1, Indexlr.Minimizer jarg1_, java.math.BigInteger jarg2);
  public final static native java.math.BigInteger Indexlr_Minimizer_min_hash_get(long jarg1, Indexlr.Minimizer jarg1_);
  public final static native void Indexlr_Minimizer_out_hash_set(long jarg1, Indexlr.Minimizer jarg1_, java.math.BigInteger jarg2);
  public final static native java.math.BigInteger Indexlr_Minimizer_out_hash_get(long jarg1, Indexlr.Minimizer jarg1_);
  public final static native void Indexlr_Minimizer_pos_set(long jarg1, Indexlr.Minimizer jarg1_, long jarg2);
  public final static native long Indexlr_Minimizer_pos_get(long jarg1, Indexlr.Minimizer jarg1_);
  public final static native void Indexlr_Minimizer_forward_set(long jarg1, Indexlr.Minimizer jarg1_, boolean jarg2);
  public final static native boolean Indexlr_Minimizer_forward_get(long jarg1, Indexlr.Minimizer jarg1_);
  public final static native void Indexlr_Minimizer_seq_set(long jarg1, Indexlr.Minimizer jarg1_, String jarg2);
  public final static native String Indexlr_Minimizer_seq_get(long jarg1, Indexlr.Minimizer jarg1_);
  public final static native void delete_Indexlr_Minimizer(long jarg1);
  public final static native long new_Indexlr_IndexlrRecord__SWIG_0();
  public final static native long new_Indexlr_IndexlrRecord__SWIG_1(long jarg1, String jarg2, String jarg3, long jarg4, long jarg5);
  public final static native void Indexlr_IndexlrRecord_num_set(long jarg1, Indexlr.IndexlrRecord jarg1_, long jarg2);
  public final static native long Indexlr_IndexlrRecord_num_get(long jarg1, Indexlr.IndexlrRecord jarg1_);
  public final static native void Indexlr_IndexlrRecord_id_set(long jarg1, Indexlr.IndexlrRecord jarg1_, String jarg2);
  public final static native String Indexlr_IndexlrRecord_id_get(long jarg1, Indexlr.IndexlrRecord jarg1_);
  public final static native void Indexlr_IndexlrRecord_barcode_set(long jarg1, Indexlr.IndexlrRecord jarg1_, String jarg2);
  public final static native String Indexlr_IndexlrRecord_barcode_get(long jarg1, Indexlr.IndexlrRecord jarg1_);
  public final static native void Indexlr_IndexlrRecord_readlen_set(long jarg1, Indexlr.IndexlrRecord jarg1_, long jarg2);
  public final static native long Indexlr_IndexlrRecord_readlen_get(long jarg1, Indexlr.IndexlrRecord jarg1_);
  public final static native void Indexlr_IndexlrRecord_minimizers_set(long jarg1, Indexlr.IndexlrRecord jarg1_, long jarg2);
  public final static native long Indexlr_IndexlrRecord_minimizers_get(long jarg1, Indexlr.IndexlrRecord jarg1_);
  public final static native void delete_Indexlr_IndexlrRecord(long jarg1);
  public final static native long Indexlr_get_minimizers(long jarg1, Indexlr jarg1_);
  public final static native long new_Indexlr__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, boolean jarg6, long jarg7, BloomFilter jarg7_, long jarg8, BloomFilter jarg8_);
  public final static native long new_Indexlr__SWIG_1(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, boolean jarg6, long jarg7, BloomFilter jarg7_);
  public final static native long new_Indexlr__SWIG_2(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, boolean jarg6);
  public final static native long new_Indexlr__SWIG_3(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long new_Indexlr__SWIG_4(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long new_Indexlr__SWIG_5(String jarg1, long jarg2, long jarg3);
  public final static native void delete_Indexlr(long jarg1);
  public final static native long Indexlr_MAX_SIMULTANEOUS_INDEXLRS_get();
  public final static native void filter_hashed_kmer(long jarg1, Indexlr.Minimizer jarg1_, boolean jarg2, boolean jarg3, long jarg4, BloomFilter jarg4_, long jarg5, BloomFilter jarg5_);
  public final static native void calc_minimizer(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8);
  public final static native short CP_OFF_get();
  public final static native int MULTISHIFT_get();
  public final static native java.math.BigInteger MULTISEED_get();
  public final static native java.math.BigInteger SEED_A_get();
  public final static native java.math.BigInteger SEED_C_get();
  public final static native java.math.BigInteger SEED_G_get();
  public final static native java.math.BigInteger SEED_T_get();
  public final static native java.math.BigInteger SEED_N_get();
  public final static native int ASCII_SIZE_get();
  public final static native long SEED_TAB_get();
  public final static native long A33R_get();
  public final static native long A31L_get();
  public final static native long C33R_get();
  public final static native long C31L_get();
  public final static native long G33R_get();
  public final static native long G31L_get();
  public final static native long T33R_get();
  public final static native long T31L_get();
  public final static native long N33R_get();
  public final static native long N31L_get();
  public final static native long MS_TAB_33R_get();
  public final static native long MS_TAB_31L_get();
  public final static native long RC_CONVERT_TAB_get();
  public final static native long CONVERT_TAB_get();
  public final static native long DIMER_TAB_get();
  public final static native long TRIMER_TAB_get();
  public final static native long TETRAMER_TAB_get();
  public final static native java.math.BigInteger rol1(java.math.BigInteger jarg1);
  public final static native java.math.BigInteger rolx(java.math.BigInteger jarg1, long jarg2);
  public final static native java.math.BigInteger ror1(java.math.BigInteger jarg1);
  public final static native java.math.BigInteger rol31(java.math.BigInteger jarg1, long jarg2);
  public final static native java.math.BigInteger rol33(java.math.BigInteger jarg1, long jarg2);
  public final static native java.math.BigInteger swapbits033(java.math.BigInteger jarg1);
  public final static native java.math.BigInteger swapbits3263(java.math.BigInteger jarg1);
  public final static native java.math.BigInteger swapxbits033(java.math.BigInteger jarg1, long jarg2);
  public final static native java.math.BigInteger ntf64__SWIG_0(String jarg1, long jarg2);
  public final static native java.math.BigInteger ntr64__SWIG_0(String jarg1, long jarg2);
  public final static native java.math.BigInteger ntf64__SWIG_1(java.math.BigInteger jarg1, long jarg2, short jarg3, short jarg4);
  public final static native java.math.BigInteger ntr64__SWIG_1(java.math.BigInteger jarg1, long jarg2, short jarg3, short jarg4);
  public final static native java.math.BigInteger ntc64__SWIG_0(String jarg1, long jarg2);
  public final static native java.math.BigInteger ntc64__SWIG_1(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native java.math.BigInteger ntc64__SWIG_2(short jarg1, short jarg2, long jarg3, long jarg4, long jarg5);
  public final static native java.math.BigInteger ntf64l(java.math.BigInteger jarg1, long jarg2, short jarg3, short jarg4);
  public final static native java.math.BigInteger ntr64l(java.math.BigInteger jarg1, long jarg2, short jarg3, short jarg4);
  public final static native java.math.BigInteger ntc64l(short jarg1, short jarg2, long jarg3, long jarg4, long jarg5);
  public final static native java.math.BigInteger ntf64__SWIG_2(String jarg1, long jarg2, long jarg3);
  public final static native java.math.BigInteger ntc64__SWIG_3(String jarg1, long jarg2, long jarg3);
  public final static native void ntm64__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native java.math.BigInteger nte64(java.math.BigInteger jarg1, long jarg2, long jarg3);
  public final static native void ntm64__SWIG_1(short jarg1, short jarg2, long jarg3, long jarg4, long jarg5);
  public final static native void ntmc64__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void ntmc64__SWIG_1(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native void ntmc64__SWIG_2(short jarg1, short jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7);
  public final static native boolean ntc64__SWIG_4(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native boolean ntmc64__SWIG_3(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native boolean ntc64__SWIG_5(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native boolean ntmc64__SWIG_4(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7);
  public final static native boolean ntmc64__SWIG_5(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8);
  public final static native void ntmc64__SWIG_6(short jarg1, short jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8);
  public final static native java.math.BigInteger mask_hash(long jarg1, long jarg2, String jarg3, String jarg4, long jarg5);
  public final static native void sub_hash(java.math.BigInteger jarg1, java.math.BigInteger jarg2, String jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8);
  public final static native java.math.BigInteger nts64__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native java.math.BigInteger nts64__SWIG_1(String jarg1, long jarg2, short jarg3, short jarg4, long jarg5, long jarg6);
  public final static native boolean ntms64__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9);
  public final static native void ntms64__SWIG_1(String jarg1, long jarg2, short jarg3, short jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9, long jarg10);
  public final static native boolean ntmsm64__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9);
  public final static native void ntmsm64__SWIG_1(String jarg1, long jarg2, short jarg3, short jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9, long jarg10);
  public final static native long parse_seeds(long jarg1);
  public final static native long new_NtHash__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long new_NtHash__SWIG_1(String jarg1, long jarg2, long jarg3);
  public final static native boolean NtHash_roll(long jarg1, NtHash jarg1_);
  public final static native void NtHash_sub(long jarg1, NtHash jarg1_, long jarg2, long jarg3);
  public final static native long NtHash_hashes(long jarg1, NtHash jarg1_);
  public final static native long NtHash_get_pos(long jarg1, NtHash jarg1_);
  public final static native boolean NtHash_forward(long jarg1, NtHash jarg1_);
  public final static native long NtHash_get_hash_num(long jarg1, NtHash jarg1_);
  public final static native long NtHash_get_k(long jarg1, NtHash jarg1_);
  public final static native java.math.BigInteger NtHash_get_forward_hash(long jarg1, NtHash jarg1_);
  public final static native java.math.BigInteger NtHash_get_reverse_hash(long jarg1, NtHash jarg1_);
  public final static native void delete_NtHash(long jarg1);
  public final static native long new_SeedNtHash__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native long new_SeedNtHash__SWIG_1(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long new_SeedNtHash__SWIG_2(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long new_SeedNtHash__SWIG_3(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long new_SeedNtHash__SWIG_4(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native long new_SeedNtHash__SWIG_5(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long new_SeedNtHash__SWIG_6(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long new_SeedNtHash__SWIG_7(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native boolean SeedNtHash_roll(long jarg1, SeedNtHash jarg1_);
  public final static native long SeedNtHash_hashes(long jarg1, SeedNtHash jarg1_);
  public final static native long SeedNtHash_get_pos(long jarg1, SeedNtHash jarg1_);
  public final static native boolean SeedNtHash_forward(long jarg1, SeedNtHash jarg1_);
  public final static native long SeedNtHash_get_hash_num(long jarg1, SeedNtHash jarg1_);
  public final static native long SeedNtHash_get_hash_num_per_seed(long jarg1, SeedNtHash jarg1_);
  public final static native long SeedNtHash_get_k(long jarg1, SeedNtHash jarg1_);
  public final static native java.math.BigInteger SeedNtHash_get_forward_hash(long jarg1, SeedNtHash jarg1_);
  public final static native java.math.BigInteger SeedNtHash_get_reverse_hash(long jarg1, SeedNtHash jarg1_);
  public final static native void delete_SeedNtHash(long jarg1);
  public final static native long new_SeqWriter__SWIG_0(String jarg1, int jarg2, boolean jarg3);
  public final static native long new_SeqWriter__SWIG_1(String jarg1, int jarg2);
  public final static native long new_SeqWriter__SWIG_2(String jarg1);
  public final static native void SeqWriter_close(long jarg1, SeqWriter jarg1_);
  public final static native void SeqWriter_write__SWIG_0(long jarg1, SeqWriter jarg1_, String jarg2, String jarg3, String jarg4, String jarg5);
  public final static native void SeqWriter_write__SWIG_1(long jarg1, SeqWriter jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native void delete_SeqWriter(long jarg1);
  public final static native void Datatype_prefixes_set(long jarg1, Datatype jarg1_, long jarg2);
  public final static native long Datatype_prefixes_get(long jarg1, Datatype jarg1_);
  public final static native void Datatype_suffixes_set(long jarg1, Datatype jarg1_, long jarg2);
  public final static native long Datatype_suffixes_get(long jarg1, Datatype jarg1_);
  public final static native void Datatype_cmds_check_existence_set(long jarg1, Datatype jarg1_, long jarg2);
  public final static native long Datatype_cmds_check_existence_get(long jarg1, Datatype jarg1_);
  public final static native void Datatype_read_cmds_set(long jarg1, Datatype jarg1_, long jarg2);
  public final static native long Datatype_read_cmds_get(long jarg1, Datatype jarg1_);
  public final static native void Datatype_write_cmds_set(long jarg1, Datatype jarg1_, long jarg2);
  public final static native long Datatype_write_cmds_get(long jarg1, Datatype jarg1_);
  public final static native void Datatype_append_cmds_set(long jarg1, Datatype jarg1_, long jarg2);
  public final static native long Datatype_append_cmds_get(long jarg1, Datatype jarg1_);
  public final static native long new_Datatype();
  public final static native void delete_Datatype(long jarg1);
  public final static native long DATATYPES_get();
  public final static native long new_DataSource(String jarg1);
  public final static native void delete_DataSource(long jarg1);
  public final static native long new_DataSink__SWIG_0(String jarg1, boolean jarg2);
  public final static native long new_DataSink__SWIG_1(String jarg1);
  public final static native void delete_DataSink(long jarg1);
  public final static native String get_pipeline_cmd(String jarg1, int jarg2);
  public final static native String get_datatype_cmd(String jarg1, long jarg2, Datatype jarg2_, int jarg3);
  public final static native long peel_datatype(String jarg1, int jarg2);
  public final static native String form_string_cmd(long jarg1, int jarg2, String jarg3);
  public final static native String PRINT_COLOR_INFO_get();
  public final static native String PRINT_COLOR_WARNING_get();
  public final static native String PRINT_COLOR_ERROR_get();
  public final static native String PRINT_COLOR_END_get();
  public final static native String get_time();
  public final static native void log_info(String jarg1);
  public final static native void log_warning(String jarg1);
  public final static native void log_error(String jarg1);
  public final static native void check_info(boolean jarg1, String jarg2);
  public final static native void check_warning(boolean jarg1, String jarg2);
  public final static native void check_error(boolean jarg1, String jarg2);
  public final static native void check_stream(long jarg1, String jarg2);
  public final static native String get_strerror();
  public final static native long split(String jarg1, String jarg2);
  public final static native String join(long jarg1, String jarg2);
  public final static native void ltrim__SWIG_0(long jarg1);
  public final static native void ltrim__SWIG_1(long jarg1);
  public final static native void rtrim__SWIG_0(long jarg1);
  public final static native void rtrim__SWIG_1(long jarg1);
  public final static native void trim__SWIG_0(long jarg1);
  public final static native void trim__SWIG_1(long jarg1);
  public final static native boolean startswith(String jarg1, String jarg2);
  public final static native boolean endswith(String jarg1, String jarg2);
}
