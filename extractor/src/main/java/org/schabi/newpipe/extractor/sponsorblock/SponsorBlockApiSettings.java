package org.schabi.newpipe.extractor.sponsorblock;

public class SponsorBlockApiSettings {
    public String apiUrl;
    /**
     * Optional caching mirror of the SponsorBlock API (same paths and query format, ending in
     * {@code /}). If set, it is queried first for segments; on any failure the request is
     * repeated against {@link #apiUrl}.
     */
    public String proxyApiUrl;
    public boolean includeSponsorCategory;
    public boolean includeIntroCategory;
    public boolean includeOutroCategory;
    public boolean includeInteractionCategory;
    public boolean includeHighlightCategory;
    public boolean includeSelfPromoCategory;
    public boolean includeMusicCategory;
    public boolean includePreviewCategory;
    public boolean includeFillerCategory;
}
