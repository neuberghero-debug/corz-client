package gg.corz;

import com.corz.client.qvm.Runtime;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;

record liilIliiiilIli(int status, JsonObject json) {
   private JsonObject iIllIlIIIl;
   private int lIllIlIIIl;

   public int IliIlllilIi() {
      return Runtime.toInt(
         Runtime.run(
            -4843797186299932839L, 1613871135, new Object[]{this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
         )
      );
   }

   @Override
   public final int hashCode() {
      return Runtime.toInt(
         Runtime.run(
            2632352859203067143L, -1966800272, new Object[]{this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
         )
      );
   }

   @Override
   public final String toString() {
      return (String)Runtime.run(
         5065121759907309638L, 913283236, new Object[]{this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
      );
   }

   private liilIliiiilIli(int status, JsonObject json) {
      Runtime.run(
         -8092992130528592074L,
         182980709,
         new Object[]{this, status, json, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
      );
   }

   static {
      Runtime.loadVm(liilIliiiilIli.class, MethodHandles.lookup());
   }

   public JsonObject liiiIIllIl() {
      return (JsonObject)Runtime.run(
         7604761809986157169L, -914809142, new Object[]{this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
      );
   }

   @Override
   public final boolean equals(Object o) {
      return (boolean)Runtime.toInt(
         Runtime.run(
            -4030828638775987650L, 852903305, new Object[]{this, o, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
         )
      );
   }
}
