package gg.corz;

import java.nio.file.Files;
import java.nio.file.Path;

public final class llIIllIlilIIllIl {
   public static Path IliIlllilIi(String schematicFile) {
      long var3 = 7565485220608491695L;
      String var1 = schematicFile != null && !schematicFile.isBlank()
         ? schematicFile
         : iIlIlllllill<"iIlIlllllill","Cn+nO4HoYqwMc7MY/rHnBnRArNnmHESF3FAxDrjqV7uKSm8=">();
      var3 ^= ((long)var1.lastIndexOf(46) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) > 0) {
         var1 = var1.substring(0, (int)(var3 >>> 32));
      }

      return lIIiIiIiiIIiIiIi.IliIlllilIi()
         .resolve(iIlIlllllill<"iIlIlllllill","VTOi7i23aLhiU9YT+wn9+uRA4Rbrmem4NjipHZtbDXKEGkwBBi8=">())
         .resolve(var1 + iIlIlllllill<"iIlIlllllill","aYp1hLIWHxud+q+zPqxHATh7BTNRdPBxSm6YX/CxFbv7dkV6x9l+">());
   }

   private llIIllIlilIIllIl() {
   }

   public static lIliIIliiIliIIli liiiIIllIl(String schematicFile) {
      try {
         Path var1 = IliIlllilIi(schematicFile);
         return !Files.exists(var1) ? null : lIliIIliiIliIIli.Illillliilli(Files.readString(var1));
      } catch (Exception var2) {
         return null;
      }
   }
}
