package example;

/**
 * Example of asciidoclet.
 *
 * @see https://github.com/asciidoctor/asciidoclet[asciidoctor/asciidoclet]
 */
public class StringUtils {

	/**
	 * Returns whether the `haystack` containing the `needle`.
	 *
	 * @param haystack a haystack
	 * @param needle a needle
	 * @return `true` if the `haystack` contains the `needle`
	 */
	// tag::contains[]
	public boolean contains(String haystack, String needle) {
		return haystack.contains(needle);
	}
	// end::contains[]
}
