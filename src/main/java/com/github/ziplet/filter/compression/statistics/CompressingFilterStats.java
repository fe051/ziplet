package com.github.ziplet.filter.compression.statistics;

/**
 * Created by fdonnarumma on 3/10/14.
 */
public interface CompressingFilterStats {

    void incrementNumResponsesCompressed();

    void incrementTotalResponsesNotCompressed();

    void incrementNumRequestsCompressed();

    void incrementTotalRequestsNotCompressed();

    void notifyRequestBytesRead(long read);

    void notifyCompressedRequestBytesRead(long read);

    void notifyResponseBytesWritten(long written);

    void notifyCompressedResponseBytesWritten(long written);

    String getStatsKey();
}
