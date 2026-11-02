package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public final class ilIillIiIiIillIi {
   public final JsonArray IliIIIlIIi;
   public final boolean lIiIIIlIIi;
   public final long iIiIIIlIIi;
   public final String IIiIIIlIIi;
   public final JsonObject lliIIIlIIi;
   public final long IiiIIIlIIi;
   public final JsonArray iliIIIlIIi;
   public final String iilIIIlIIi;

   public ilIillIiIiIillIi(
      String serverTimeMs, String buildHash, boolean closed, long maxSeq, JsonArray members, JsonObject messages, JsonArray hostId, long retained
   ) {
      this.iilIIIlIIi = serverTimeMs;
      this.IIiIIIlIIi = buildHash;
      this.lIiIIIlIIi = closed;
      this.iIiIIIlIIi = maxSeq;
      this.IliIIIlIIi = members;
      this.lliIIIlIIi = messages;
      this.iliIIIlIIi = hostId;
      this.IiiIIIlIIi = retained;
   }
}
