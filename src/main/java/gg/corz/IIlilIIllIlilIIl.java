package gg.corz;

import net.minecraft.class_243;

public record IIlilIIllIlilIIl(int entityId, int causeId, int directId, class_243 source, String type) implements IlIillIiilIi {
   private final class_243 IiiiiillIl;
   private final int IliiiillIl;
   private final int lliiiillIl;
   private final int iliiiillIl;
   private final String liiiiillIl;

   public IIlilIIllIlilIIl(int causeId, int entityId, int directId, class_243 source) {
      this(causeId, entityId, directId, source, iliIiiliiiii<"iliIiiliiiii","U8gh8Xm2L6cf7b63NPN03fTXaoZG73kSOYJW5qA=">());
   }

   public int liiiIIllIl() {
      return this.lliiiillIl;
   }

   public String lIiiIiIlilli() {
      return this.liiiiillIl;
   }

   public int IliIlllilIi() {
      return this.IliiiillIl;
   }

   public class_243 IilliliilIIi() {
      return this.IiiiiillIl;
   }

   public int iIlIlllllill() {
      return this.iliiiillIl;
   }

   public IIlilIIllIlilIIl(int entityId, int causeId, int directId, class_243 source, String type) {
      this.IliiiillIl = entityId;
      this.lliiiillIl = causeId;
      this.iliiiillIl = directId;
      this.IiiiiillIl = source;
      this.liiiiillIl = type;
   }
}
