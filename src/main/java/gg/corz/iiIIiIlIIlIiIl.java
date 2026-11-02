package gg.corz;

public final class iiIIiIlIIlIiIl {
   public static boolean IliIlllilIi(IiIIliliIIli kind) {
      return kind == IiIIliliIIli.iliiilIIlIiiiilIIl;
   }

   public static Illililllllilill liiiIIllIl(int walkableMembers, int tempAccessAvailable, boolean tempMembers) {
      return tempMembers
         ? new Illililllllilill(walkableMembers + tempAccessAvailable, 0, false)
         : new Illililllllilill(walkableMembers, tempAccessAvailable, tempAccessAvailable > 0 && walkableMembers == 0);
   }

   private iiIIiIlIIlIiIl() {
   }
}
