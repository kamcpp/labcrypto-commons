package org.labcrypto.util.atom;

import java.util.List;

public interface FeedFetcher {
    List<FeedItem> fetch(String feedUrl) throws Exception;
}
