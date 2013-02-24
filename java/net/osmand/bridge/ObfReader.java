/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.bridge;

public class ObfReader {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ObfReader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ObfReader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CoreOsmAndJNI.delete_ObfReader(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getVersion() {
    return CoreOsmAndJNI.ObfReader_getVersion(swigCPtr, this);
  }

  public SWIGTYPE_p_std__listT_OsmAnd__ObfSection_p_t getSections() {
    return new SWIGTYPE_p_std__listT_OsmAnd__ObfSection_p_t(CoreOsmAndJNI.ObfReader_getSections(swigCPtr, this), true);
  }

}