package club.chillrainqcna.chillrainbbs.entity.enums;

public enum AttachmentFileTypeEnum {
    ZIP(0, new String[]{".zip", ".rar"}, "压缩包")
    ;
    private Integer type;
    private String[] suffixs;
    private String desc;
    public static AttachmentFileTypeEnum getByType(Integer type){
        for(AttachmentFileTypeEnum item : AttachmentFileTypeEnum.values()){
            if(item.getType() == type){
                return item;
            }
        }
        return null;
    }

    AttachmentFileTypeEnum(Integer type, String[] suffixs, String desc) {
        this.type = type;
        this.suffixs = suffixs;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public String[] getSuffixs() {
        return suffixs;
    }

    public String getDesc() {
        return desc;
    }
}
