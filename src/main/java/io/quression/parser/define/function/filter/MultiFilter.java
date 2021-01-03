package io.quression.parser.define.function.filter;

import io.quression.parser.define.function.Sub;

import java.util.List;

public abstract class MultiFilter extends Sub implements IFilter {

    private Contact contact;

    private List<UniFilter> uniFilters;

    public MultiFilter(Contact contact, List<UniFilter> uniFilters) {
        this.contact = contact;
        this.uniFilters = uniFilters;
    }

    public Contact getContact() {
        return contact;
    }

    public MultiFilter setContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public List<UniFilter> getUniFilters() {
        return uniFilters;
    }

    public MultiFilter setUniFilters(List<UniFilter> uniFilters) {
        this.uniFilters = uniFilters;
        return this;
    }

    public MultiFilter addUniFilters(UniFilter uniFilter) {
        this.uniFilters.add(uniFilter);
        return this;
    }
}
